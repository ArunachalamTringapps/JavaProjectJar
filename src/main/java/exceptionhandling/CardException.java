package org.example;

class CardException {
    String name;
    int  no1;
    String date;
    CardException(String name, int no1, String date){
        this.name=name;
        this.date=date;
        this.no1=no1;
    }
    public boolean equalling(int no2){
        String no4=String.valueOf(no2);
        String no3=String.valueOf(no1);
        return no3.equals(no4);
    }
    public CardException cloneexample()  {
        try {
            return (CardException) super.clone();
        }catch (Exception ex){
            return this;
        }

    }
}
