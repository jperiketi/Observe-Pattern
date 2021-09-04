public class Database {

    public static void main(String[] args){

        FrontEnd table = new FrontEnd();

        Subscriber NewContext = new Subscriber("New");

       table.Subscribe(NewContext);

       NewContext.subChannel(table);

       table.upload("data inserted");


    }
}
