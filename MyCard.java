import java.util.Random;

public class MyCard {


    private int value;
    private Color color1;
    private  Color color2;
    private Color color3;


    public int getValue() {
        shuffleCard();
        return value;
    }
    public int setValue(int random) {
        this.value = random;
        return random;
    }
    public void shuffleCard() {
        Random random = new Random();
        setValue (random.nextInt(13)+1);
    }
    public Color getValueColor(){
        return color1;
    }
    public Color getValueColor2(){
        return color2;
    }
    public Color getValuecolor3(){
        return color3;
    }

    public MyCard(){
        shuffleCard2();
    }
    public void shuffleCard2(){
        Random random = new Random();
        color1=(random.nextBoolean() ? Color.HJERTER : Color.KLØR);
        color2=(random.nextBoolean() ? Color.RUDER : Color.SPAR);
        color3=(random.nextBoolean() ? color1 : color2);
    }
}


