package kz.abcsoft.recyclerviewdemo1;

public class Cat {
    private String mName;
    private String mSubtitle;

    public Cat() {}

    public Cat(String name, String subtitle) {
        this.mName = name;
        this.mSubtitle = subtitle;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public void setSubtitle(String subtitle) {
        this.mSubtitle = subtitle;
    }
}