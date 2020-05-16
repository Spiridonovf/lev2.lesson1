package lesson1;

public class Main {

    public static void main(String[] args) {

         int max_wall=200;
         int max_track=1000;
         int max_cat_run = 500;
         int max_cat_jump= 300;
        int max_people_run = 1000;
        int max_people_jump= 150;
        int max_robot_run = 5000;
        int max_robot_jump= 100;

        //инициализация участников и препятствий
         Object[] arr_somebody = new Object[9];
         Object[] arr_barrier = new Object[3];

         for (int i=0;i<arr_barrier.length;i++)
         {
             if ((int)(Math.random()*2)==0){
                 arr_barrier[i] = new Wall((int) (Math.random()* (max_wall - 5)+5) );
             } else {
                 arr_barrier[i] = new Track((int) (Math.random()*(max_track - 10)+10));
             }
         }

        arr_somebody[0] = new People((int) (Math.random()*max_people_run),(int) (Math.random()*max_people_jump),"Василий");
        arr_somebody[1] = new People((int) (Math.random()*max_people_run),(int) (Math.random()*max_people_jump),"Иван");;
        arr_somebody[2] = new People((int) (Math.random()*max_people_run),(int) (Math.random()*max_people_jump),"Алексей");
        arr_somebody[3] = new Cat((int) (Math.random()*max_cat_run),(int) (Math.random()*max_cat_jump),"Мурзик");
        arr_somebody[4] = new Cat((int) (Math.random()*max_cat_run),(int) (Math.random()*max_cat_jump),"Барсик");
        arr_somebody[5] = new Cat((int) (Math.random()*max_cat_run),(int) (Math.random()*max_cat_jump),"Персик");
        arr_somebody[6] = new Robot((int) (Math.random()*max_robot_run),(int) (Math.random()*max_robot_jump),"R01");
        arr_somebody[7]  = new Robot((int) (Math.random()*max_robot_run),(int) (Math.random()*max_robot_jump),"R02");
        arr_somebody[8]  = new Robot((int) (Math.random()*max_robot_run),(int) (Math.random()*max_robot_jump),"R03");

        //побежали и попрыгали
        for (int i=0;i<arr_barrier.length;i++) {
            switch (arr_barrier[i].getClass().getName()) {
                case "lesson1.Wall":
                    Wall wall = (Wall)arr_barrier[i];
                    for  (int j=0;j<arr_somebody.length;j++) {
                        switch (arr_somebody[j].getClass().getName()) {
                            case "lesson1.People":
                                People people = (People)arr_somebody[j];
                                people.Jump(wall.getHeight());
                                break;
                            case "lesson1.Cat":
                                Cat cat = (Cat)arr_somebody[j];
                                cat.Jump(wall.getHeight());
                                break;
                            case "lesson1.Robot":
                                Robot robot = (Robot)arr_somebody[j];
                                robot.Jump(wall.getHeight());
                                break;
                        }
                    }
                    break;
                case "lesson1.Track":
                    Track track = (Track)arr_barrier[i];
                    for  (int j=0;j<arr_somebody.length;j++) {
                        switch (arr_somebody[j].getClass().getName()) {
                            case "lesson1.People":
                                People people = (People)arr_somebody[j];
                                people.Run(track.getLength());
                                break;
                            case "lesson1.Cat":
                                Cat cat = (Cat)arr_somebody[j];
                                cat.Run(track.getLength());
                                break;
                            case "lesson1.Robot":
                                Robot robot = (Robot)arr_somebody[j];
                                robot.Run(track.getLength());
                                break;
                        }
                    }
                    break;
            }
        }


    }
}
