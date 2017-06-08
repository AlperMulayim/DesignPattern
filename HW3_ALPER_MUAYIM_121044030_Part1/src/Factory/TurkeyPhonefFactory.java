package Factory;

import Models.AmanIflas;
import Models.IflasDeluxe;
import Models.MaxEffortModel;
import Phone.*;
import Sales.TurkeyMarket;

/**
 * Created by Alper on 12.12.2016.
 */
public class TurkeyPhonefFactory extends   PhoneFactory {


    public TurkeyPhonefFactory(String modelName) {

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
        market = new TurkeyMarket();

        modelProperties = model.getProperties();
        salesPacket = market.getSalesPacket();

        iflasPhone.setMarket(market.getName());
        iflasPhone.setModelName(model.getModelName());


    }
}
