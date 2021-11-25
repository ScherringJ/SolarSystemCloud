package spring.solarsystemcloudapi.model;

import javax.persistence.*;

@Entity
@Table(name = "planete")
public class Planete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "discovery")
    private String discovery;

    @Column(name = "type")
    private String type;

    protected Planete() {}

    public Planete(Integer id, String name, String discovery, String type) {
        this.id = id;
        this.name = name;
        this.discovery = discovery;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscovery() {
        return discovery;
    }

    public void setDiscovery(String discovery) {
        this.discovery = discovery;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean valide() {
        boolean bool = true;
        if (this.name == null || this.name.equals("")) {
            bool = false;
        } else if (this.discovery == null || this.discovery.equals("")) {
            bool = false;
        } else if (this.type == null || this.type.equals("")) {
            bool = false;
        }
        return bool;
    }

    @Override
    public String toString() {
        return "Planete{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discovery='" + discovery + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
