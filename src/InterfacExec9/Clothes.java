package InterfacExec9;

/**
 * Created by barto on 21/06/2017.
 */
public abstract class Clothes {
    private double size = 48d;
    private String sizelabel = "L";
    private String quality = "low";
    private String branch = "Arion";
    private long articleNr = 12850000;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getSizelabel() {
        return sizelabel;
    }

    public void setSizelabel(String sizelabel) {
        this.sizelabel = sizelabel;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getArticleNr() {
        return articleNr;
    }

    public void setArticleNr(long articleNr) {
        this.articleNr = articleNr;
    }

    public boolean order(String branch, long articleNr){
        System.out.printf("The order: %d from branch %s has been ordered.\n", articleNr, branch);
        return true;
    }
}
