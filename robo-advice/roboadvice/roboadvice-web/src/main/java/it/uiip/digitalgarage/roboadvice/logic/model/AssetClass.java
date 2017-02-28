package it.uiip.digitalgarage.roboadvice.logic.model;

public class AssetClass {

    private Long id;
    private String name;

    public AssetClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}