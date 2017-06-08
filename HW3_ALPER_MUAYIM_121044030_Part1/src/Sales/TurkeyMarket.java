package Sales;

/**
 * Created by Alper on 12.12.2016.
 */
public class TurkeyMarket implements Market{
    String name;
    SalesPacket turkeyPacket;

    public TurkeyMarket(){
        turkeyPacket = new SalesPacket();
        this.name = "Turkey";

        this.turkeyPacket.setDisplayBit(32);
        this.turkeyPacket.setBattteryType("Lityum-Borom");
        this.turkeyPacket.setCpuCore(8);
        this.turkeyPacket.setMaxStorage(128);
        this.turkeyPacket.setOptiZoom(4);
        this.turkeyPacket.setMaxProof(200);
    }

    public String getName() {
        return name;
    }

    public SalesPacket getSalesPacket() {
        return turkeyPacket;
    }
}
