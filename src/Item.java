public enum Item {
    pisau ("Pisau"),
    pedang ("Pedang"),
    jamu ("Jamu"),
    ikan ("Ikan"),
    jeruk("Jeruk");

    private  final String name;
    private  Item (String s){
        name = s;
    }
    public boolean equalsName(String otherName){
        return  name.equals(otherName);
    }

    public String toString(){
        return this.name;
    }


}
