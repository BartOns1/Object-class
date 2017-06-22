package InterfacExec9;

/**
 * Created by barto on 21/06/2017.
 */
public class Trousers extends Clothes {
    private boolean jeans;

    public boolean isJeans() {
        return jeans;
    }

    public void setJeans(boolean jeans) {
        this.jeans = jeans;
    }

    public void print(){
        System.out.printf("The Trousers %s %s %s %d is printed\n", getBranch(), getQuality(), getSizelabel(),getArticleNr());
    }
}
