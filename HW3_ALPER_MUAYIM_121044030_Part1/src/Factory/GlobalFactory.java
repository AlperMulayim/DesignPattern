package Factory;

import Models.AmanIflas;
import Models.IflasDeluxe;
import Models.MaxEffortModel;
import Phone.IflasPhone;
import Sales.GlobalMarket;

/**
 * Created by Alper on 13.12.2016.
 */
public class GlobalFactory  extends PhoneFactory {

    public  GlobalFactory(String modelName){
        iflasPhone = new IflasPhone();

        if (modelName.equals("MaximumEffort")) {
            model = new MaxEffortModel();
        }
        else if(modelName.equals("IflasDelux")){
            model = new IflasDeluxe();
        }
        else if(modelName.equals("IAmanIflas")){
            model = new AmanIflas();
        }

        market = new GlobalMarket();

        modelProperties = model.getProperties();
        salesPacket = market.getSalesPacket();

        iflasPhone.setMarket(market.getName());
        iflasPhone.setModelName(model.getModelName());

    }
}
