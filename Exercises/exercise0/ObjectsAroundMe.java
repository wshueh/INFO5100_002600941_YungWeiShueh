import java.util.UUID;

public class ObjectsAroundMe {

    // Example 1
    static class Pillow {
        String id;
        String material;
        int sales;
        boolean isSoft;
        boolean isPopular;
        String color;
        double length;
        double width;

        Pillow(String material, int sales, boolean isSoft, boolean isPopular, String color, double length, double width) {
            this.id = UUID.randomUUID().toString();
            this.material = material;
            this.sales = sales;
            this.isSoft = isSoft;
            this.isPopular = isPopular;
            this.color = color;
            this.length = length;
            this.width = width;
            System.out.println("Chair instance created: " + this.id);
        }

        void sleep() {
            System.out.println("Sleeping on the pillow");
        }

        void pick() {
            System.out.println("Picking the most comfortable pillow for yourself");
        }

        void sit() {
            System.out.println("Sitting on the pillow");
        }
    }

    // Example 2
    static class Shampoo {
        String id;
        String brand;
        String formula;
        String scent;
        String hairType;
        double size;
        boolean goodSelling;
        String color;

        Shampoo(String brand, String formula, String scent, String hairType, double size, boolean goodSelling, String color) {
            this.id = UUID.randomUUID().toString();
            this.brand = brand;
            this.formula = formula;
            this.scent = scent;
            this.hairType = hairType;
            this.size = size;
            this.goodSelling = goodSelling;
            this.color = color;
            System.out.println("Desk instance created: " + this.id);
        }

        void hairWash() {
            System.out.println("Wash your hair using shampoo");
        }

        void lather() {
            System.out.println("Lathering hair");
        }

        void moisturizeHair() {
            System.out.println("Shampoo can moisturize hair");
        }
    }

    // Example 3:  with nested classes
    static class Macbook {
        String id;
        String model;
        int ram;
        int storage;
        String gpu;
        double screenSize;
        String color;
        boolean hasMouse;


        Macbook(String model, int ram, int storage, String gpu, double screenSize, String color, boolean hasMouse) {
            this.id = UUID.randomUUID().toString();
            this.model = model;
            this.ram = ram;
            this.storage = storage;
            this.gpu = gpu;
            this.screenSize = screenSize;
            this.color = color;
            this.hasMouse = hasMouse;
            System.out.println("Macebook instance created: " + this.id);
        }

        void turnOn() {
            System.out.println("Turning on the macbook");
        }

        void turnOff() {
            System.out.println("Turning off the macbook");
        }

        void fix() {
            System.out.println("Fixing the macbook");
        }

        // Nested class 1
        static class Keyboard {
            String id;
            String color;
            int numKeys;
            boolean goodAtTyping;
            boolean hasGoodDesign;
            boolean fingerprintProne;
            boolean waterproof;
            double price;


            Keyboard(String color, int numKeys, boolean goodAtTyping, boolean hasGoodDesign, boolean fingerprintProne, boolean waterproof, double price) {
                this.id = UUID.randomUUID().toString();
                this.color = color;
                this.numKeys = numKeys;
                this.goodAtTyping = goodAtTyping;
                this.hasGoodDesign = hasGoodDesign;
                this.fingerprintProne = fingerprintProne;
                this.waterproof = waterproof;
                this.price = price;
                System.out.println("Keyboard instance created: " + this.id);
            }

            void broken() {
                System.out.println("Keyboard is broken");
            }

            void clean() {
                System.out.println("Cleaning keyboard");
            }

            void type() {
                System.out.println("Typing on keyboard");
            }
        }

        // Nested class 2
        static class Mouse {
            String id;
            int year;
            String brand;
            String color;
            String type;
            String model;
            boolean isWireless;
            int numButtons;

            Mouse(int year, String brand, String color, String type, String model, boolean isWireless, int numButtons) {
                this.id = UUID.randomUUID().toString();
                this.year = year;
                this.brand = brand;
                this.color = color;
                this.type = type;
                this.model = model;
                this.isWireless = isWireless;
                this.numButtons = numButtons;
                System.out.println("Mouse instance created: " + this.id);
            }

            void connect() {
                System.out.println("Connecting mouse");
            }

            void use() {
                System.out.println("Using mouse");
            }

            void click() {
                System.out.println("Clicking the mouse button");
            }
        }
    }

    // Example 4
    static class Pen {
        String id;
        String color;
        double width;
        double length;
        String brand;
        boolean isGoodForWriting;
        boolean isPopular;
        double weight;

        Pen(String color, double width, double length, String brand, boolean isGoodForWriting, boolean isPopular, double weight) {
            this.id = UUID.randomUUID().toString();
            this.color = color;
            this.width = width;
            this.length = length;
            this.brand = brand;
            this.isGoodForWriting = isGoodForWriting;
            this.isPopular = isPopular;
            this.weight = weight;
            System.out.println("Pen instance created: " + this.id);
        }

        void write() {
            System.out.println("Writing on the paper");
        }

        void draw() {
            System.out.println("Drawing on the paper");
        }

        void refill() {
            System.out.println("Refilling the pen");
        }
    }

    //Example 5
    static class Cellphone{
        String id;
        String model;
        String brand;
        double price;
        String operatingSystem;
        double weight;
        double length;
        double screenSize;

        Cellphone(String model, String brand, double price, String operatingSystem, double weight, double length, double screenSize){
            this.id = UUID.randomUUID().toString();
            this.model = model;
            this.brand = brand;
            this.price = price;
            this.operatingSystem = operatingSystem;
            this.weight = weight;
            this.length = length;
            this.screenSize = screenSize;
            System.out.println("Cellphone instance created: " + this.id);
        }

        void call() {
            System.out.println("Making a phone call.");
        }
    
        void sendText() {
            System.out.println("Sending an Text.");
        }
    
        void type() {
            System.out.println("Typing on the phone.");
        }
    }

    //Example 6
    static class Book {
        String id;
        String bookTitle;
        String author;
        String color;
        int publicationYear;
        int pages;
        double length;
        boolean isSecondBook;
    
        Book(String bookTitle, String author, String color, int publicationYear, int pages, double length, boolean isSecondBook) {
            this.id = java.util.UUID.randomUUID().toString();
            this.bookTitle = bookTitle;
            this.author = author;
            this.color = color;
            this.publicationYear = publicationYear;
            this.pages = pages;
            this.length = length;
            this.isSecondBook = isSecondBook;
            System.out.println("Book instance created: " + this.id);
        }

        void open() {
            System.out.println("Opening the book.");
        }
    
        void read() {
            System.out.println("Reading the book.");
        }

        void get() {
            System.out.println("Getting the book from a friend.");
        }
    }
    
    //Example 7
    static class Wallet {
        String id;
        String material;
        double width;
        boolean isForMale;
        boolean hasCoinPocket;
        boolean isSecondHand;
        boolean isGucci;
        double price;
    
        Wallet(String material, double width, boolean isForMale, boolean hasCoinPocket, boolean isSecondHand, boolean isGucci, double price) {
            this.id = java.util.UUID.randomUUID().toString();
            this.material = material;
            this.width = width;
            this.isForMale = isForMale;
            this.hasCoinPocket = hasCoinPocket;
            this.isSecondHand = isSecondHand;
            this.isGucci = isGucci;
            this.price = price;
            System.out.println("Wallet instance created: " + this.id);
        }

        void open() {
            System.out.println("Opening the wallet.");
        }
    
        void close() {
            System.out.println("Closing the wallet.");
        }

        void check() {
            System.out.println("Checking out the wallet.");
        }
    }

    // Example 8
    static class Backpack {
        String id;
        String material;
        String color;
        String brand;
        double price;
        boolean isWaterproof;
        boolean canBuyOnline;
        String sellingPlace;
    
        Backpack(String material, String color, String brand, double price, boolean isWaterproof, boolean canBuyOnline, String sellingPlace) {
            this.id = java.util.UUID.randomUUID().toString();
            this.material = material;
            this.color = color;
            this.brand = brand;
            this.price = price;
            this.isWaterproof = isWaterproof;
            this.canBuyOnline = canBuyOnline;
            this.sellingPlace = sellingPlace;
            System.out.println("Backpack instance created: " + this.id);
        }

        void scratch() {
            System.out.println("Scratching the backpack.");
        }
    
        void buy() {
            System.out.println("Buying the backpack.");
        }

        void take() {
            System.out.println("Taking the backpack.");
        }
    }

    // Example 9
    static class CoffeeMaker {
        String id;
        String color;
        String brand;
        String model;
        double price;
        int maxCups; 
        boolean hasTimer;
        boolean hasGrinder;

        CoffeeMaker(String color, String brand, String model, double price, int maxCups, boolean hasTimer, boolean hasGrinder) {
            this.id = java.util.UUID.randomUUID().toString();
            this.color = color;
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.maxCups = maxCups;
            this.hasTimer = hasTimer;
            this.hasGrinder = hasGrinder;
            System.out.println("Coffee Maker instance created: " + this.id);
        }

        void clean() {
            System.out.println("Cleaning the coffee maker.");
        }
    
        void buy() {
            System.out.println("Buying the coffee maker.");
        }

        void makeCoffee() {
            System.out.println("Using the coffee maker to make coffee");
        }
    }

    //Example 10
    static class MeetingRoom {
        String id;
        int capacity;
        int numsTables;
        int numsChairs;
        int whiteboard; 
        int marker;
        int numsLight;
        boolean openOnWeekends;
    
        MeetingRoom(int capacity, int numsTables, int numsChairs, int whiteboard, int marker, int numsLight, boolean openOnWeekends) {
            this.id = java.util.UUID.randomUUID().toString();
            this.capacity = capacity;
            this.numsTables = numsTables;
            this.numsChairs = numsChairs;
            this.whiteboard = whiteboard;
            this.marker = marker;
            this.numsLight = numsLight;
            this.openOnWeekends = openOnWeekends;
            System.out.println("Meeting Room instance created: " + this.id);
        }

        void booking() {
            System.out.println("Booking the meeting room.");
        }
    
        void dance() {
            System.out.println("Dancing at the meeting room.");
        }

        void cancelBooking() {
            System.out.println("Cancel booking the meeting room.");
        }
    }



    public static void main(String[] args) {
        // example 1
        Pillow pillow1 = new Pillow("Memory Foam", 100, true, true, "Brown", 4.0, 2.5);
        Pillow pillow2 = new Pillow("Down", 50, true, true, "Black", 3.2, 1.2);
        Pillow pillow3 = new Pillow("Plastic", 10, false, false, "White", 2.5, 1.8);

        // example 2
        Shampoo shampoo1 = new Shampoo("A", "Sulfate-Free", "Flower","Dry", 20.0, true, "Red");
        Shampoo shampoo2 = new Shampoo("B", "Hydrating", "Wood","Greesy", 33.4, false, "Grey");
        Shampoo shampoo3 = new Shampoo("C", "Clarifying", "Nature","Dry", 2.5,  false, "Blue");

        // example 3
        Macbook macbook1 = new Macbook("DDF-3", 222, 16, "512G", 2222, "Silver", true);
        Macbook macbook2 = new Macbook("SFW-232", 556, 6, "256GB", 800, "Black", false);
        Macbook macbook3 = new Macbook("OOOE-134", 7777, 100, "1TB", 5000, "Blue", true);

        //example 4
        Pen pen1 = new Pen("Red", 4.4, 50.0, "A", true, true, 2.3);
        Pen pen2 = new Pen("Blue", 3.4, 66.0, "B", false, false, 1.0);
        Pen pen3 = new Pen("Green", 4.0, 53.0, "C", true, false, 2.9);

        //example 5
        Cellphone cellphone1 = new Cellphone("pro max 13", "Iphone", 2000.0, "apple", 30.0, 15.0, 22.0);
        Cellphone cellphone2 = new Cellphone("butterfly 25", "Nokia", 20.0, "banana", 10.0, 13.0, 20.0);
        Cellphone cellphone3 = new Cellphone("pro 5", "Iphone", 1500.0, "apple", 22.0, 12.0, 12.0);
    
        //example 6
        Book book1 = new Book("To kill a mockingbird", "Alex Smith", "Red", 1939, 2000, 20.5, true);
        Book book2 = new Book("Little Prince", "Gary Wang", "Yellow", 1900, 20, 18.5, false);
        Book book3 = new Book("Silver Lining Playbook", "Oliver B", "Green", 1999, 100, 15.5, true);
    
        //example 7
        Wallet wallet1 = new Wallet("Plastic", 22.9, true, false, true, true, 5000.3);
        Wallet wallet2 = new Wallet("Wood", 30.5, false, true, true, false, 50.0);
        Wallet wallet3 = new Wallet("Animal Fur", 44.0, true, false, true, false, 10.1);
    
        //example 8
        Backpack backpack1 = new Backpack("Plastic", "White", "LV",  23.9, true, true, "Taiwan");
        Backpack backpack2 = new Backpack("Fabric", "Brown", "Chanel",  3000.0, false, true, "Japan");
        Backpack backpack3 = new Backpack("Gold", "Purple", "PAM",  500000.4, true, true, "US");
    
        //example 9
        CoffeeMaker coffeeMaker1 = new CoffeeMaker("Pink", "AAA", "56-XXX", 100.0, 5, true, true);
        CoffeeMaker coffeeMaker2 = new CoffeeMaker("Baby Blue", "BBB", "20-OXX", 200.0, 10, false, true);
        CoffeeMaker coffeeMaker3 = new CoffeeMaker("Orange", "CCC", "333-XP", 300.0, 8, true, false);

        //example 10
        MeetingRoom meetingRoom1 = new MeetingRoom(10, 5, 20, 3, 2, 3, true);
        MeetingRoom meetingRoom2 = new MeetingRoom(30, 10, 50, 10, 25, 10, false);
        MeetingRoom meetingRoom3 = new MeetingRoom(5, 1, 2, 1, 1, 1, true);
    }

 
}


