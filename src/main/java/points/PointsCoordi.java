package points;

class PointsCoordi {
    int x1;
    int y1;

    PointsCoordi(int x1, int y1){
        this.x1=x1;
        this.y1=y1;
    }

    public PointsCoordi cloneexample()  {
        try {
            return (PointsCoordi)  super.clone();
        }catch (Exception ex){
            return this;
        }

    }

    public boolean equalling(int x2, int y2){
        String a1=String.valueOf(x1);
        String b1=String.valueOf(y1);
        String a2=String.valueOf(x2);
        String b2=String.valueOf(y2);
        return a1.equals(a2) && b1.equals(b2);
    }

}
