package Week01.Assignment;

public class phoneCharger extends Charger{
    private String connectorType;
    private boolean supportFastCharging;

    public void setConnectorType(String type) {
        connectorType = type;
    }
    public void setFastChargeSupported(String input){
        supportFastCharging = input.equalsIgnoreCase("yes");
    }

    public boolean canFastCharge (){
        if (supportFastCharging && outputWatt >= 45){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Connector: " + connectorType);
        System.out.println("Type: Phone Charger");
        System.out.println("Fast Charge Support: " + canFastCharge());
    }
}

