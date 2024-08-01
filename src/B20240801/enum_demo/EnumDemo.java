package B20240801.enum_demo;

public enum EnumDemo implements ForEnumDemo{
    MONDAY{
        @Override
        public void desc() {
            System.out.println("1");
        }
    },
    TUESDAY{
        @Override
        public void desc() {
            System.out.println("2");
        }
    },
    WEDNESDAY{
        @Override
        public void desc() {
            System.out.println("3");
        }
    },
    THURSDAY{
        @Override
        public void desc() {
            System.out.println("4");
        }
    },
    FRIDAY{
        @Override
        public void desc() {
            System.out.println("5");
        }
    },
    SATURDAY{
        @Override
        public void desc() {
            System.out.println("6");
        }
    },
    SUNDAY{
        @Override
        public void desc() {
            System.out.println("7");
        }
    };

}
