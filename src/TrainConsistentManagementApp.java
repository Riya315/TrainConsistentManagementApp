// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Abstract Goods Bogie
abstract class GoodsBogie {
    protected String shape;
    protected String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            validateCargo(cargo);
            this.cargo = cargo;
            System.out.println("✅ Cargo '" + cargo + "' successfully assigned to " + shape + " bogie.");
        } catch (CargoSafetyException e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            System.out.println("ℹ️ Validation completed for " + shape + " bogie.\n");
        }
    }

    protected abstract void validateCargo(String cargo);
}

// Rectangular Bogie
class RectangularBogie extends GoodsBogie {
    public RectangularBogie() {
        super("Rectangular");
    }

    @Override
    protected void validateCargo(String cargo) {
        if (cargo.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Petroleum cannot be assigned to a Rectangular bogie (unsafe combination).");
        }
    }
}

// Cylindrical Bogie
class CylindricalBogie extends GoodsBogie {
    public CylindricalBogie() {
        super("Cylindrical");
    }

    @Override
    protected void validateCargo(String cargo) {
        // Cylindrical bogies can safely carry petroleum
    }
}

public class TrainConsistentManagementApp {

    public static void main(String[] args) {

            GoodsBogie rectBogie = new RectangularBogie();
            GoodsBogie cylBogie = new CylindricalBogie();

            // Test Case 1: Safe Assignment
            cylBogie.assignCargo("Petroleum");

            // Test Case 2: Unsafe Assignment
            rectBogie.assignCargo("Petroleum");

            // Test Case 3: Program continues after exception
            rectBogie.assignCargo("Coal");
        }
    }
