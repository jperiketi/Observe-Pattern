public class Subscriber {

    private String name;
    private FrontEnd frontEnd = new FrontEnd();

    public Subscriber(String model) {
        this.name = model;
    }

    public void update(){
        System.out.println("data changed");
    }

    public void subChannel(FrontEnd frontEnd){


    }
}
