package enums;

public enum BankOpeningHours {

    MONDAY {
        public void printOpeningHours() {
            System.out.println("9am - 3pm");
        }
    },
    TUESDAY {
        public void printOpeningHours() {
            System.out.println("9am - 3pm");
        }
    },
    WEDNESDAY {
        public void printOpeningHours() {
            System.out.println("9am - 3pm");
        }
    },
    THURSDAY {
        public void printOpeningHours() {
            System.out.println("9am - 1pm");
        }
    },
    FRIDAY {
        public void printOpeningHours() {
            System.out.println("9am - 1pm");
        }
    },
    SATURDAY {
        public void printOpeningHours() {
            System.out.println("9am - 1pm");
        }
    },
    SUNDAY {
        public void printOpeningHours() {
            System.out.println("Closed");
        }
    };

    abstract public void printOpeningHours();
}
