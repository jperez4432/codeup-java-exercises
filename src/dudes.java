
    class dudes {
        public static long worldPopulation = 7500000000L; // class property
        public String name; // instance property

        public static void main(String[] args) {
            dudes theBestDrummerAlive = new dudes();
            theBestDrummerAlive.name = "Neil Peart";

            dudes.worldPopulation += 1; // accessing a static property

            System.out.println(dudes.worldPopulation); // 7500000001

            // technically this will work, but it is usually better to reference
            // static properties through the class, not instances
            System.out.println(theBestDrummerAlive.name); // 7500000001

            // DONT DO THIS, it will not compile
           // System.out.println(Person.name);
        }
    }

