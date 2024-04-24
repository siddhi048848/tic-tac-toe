package player;

public class Player {
    private String name;
    private char symbol;
    private String address;
    private String contactno;
    private String emailId;
    private int age;

    public void setPlayerDetails(String name,char symbol,String address, String contactno,String emailId,int age){
        this.name=name;
        this.symbol=symbol;
        this.address=address;
        this.contactno=contactno;
        this.emailId=emailId;
        this.age=age;
    }

    public void setPlayerNameAndSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }

    public void setPlayerSymbol(char symbol){
        this.symbol=symbol;
    }

    public String getPlayername(){
        return this.name;
    }

    public char getPlayerSymbol(){
        return this.symbol;
    }

    public void getPlayerNameAndSymbol(){
        System.out.println("Player Name: " + this.name);
        System.out.println("Player Symbol: " + this.symbol);
    }

    public void changeSymbol(char symbol){
        this.symbol=symbol;
    }

    public void getPlayerDetails(){
        System.out.println("Player Name: " + this.name);
        System.out.println("Player symbol: " + this.symbol);
        System.out.println("Player emailId: " + this.emailId);
        System.out.println("Player age: " + this.age);
        System.out.println("Player Contact Number: " + this.contactno);
        System.out.println("Player Address: " + this.address);
    }

}
