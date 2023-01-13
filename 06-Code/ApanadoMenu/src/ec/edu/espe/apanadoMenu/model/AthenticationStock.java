package ec.edu.espe.apanadoMenu.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class AthenticationStock {
    private int stock;
    private boolean availability;
    
    public AthenticationStock() {
        int stock = 0;
        boolean availability = false;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    
}
