public class Track_Factory {
    public Track getTrack(String trackType){
        if(trackType == null){
            return null;
        }
        else if(trackType.equalsIgnoreCase("BlueMoonBaySpeedwayUSA")){
            return new BlueMoonBaySpeedway();
        }
        else if(trackType.equalsIgnoreCase("CircuitDeSpaFrancorchampsGermany")){
            return new CircuitDeSpaFrancorchamps();
        }
        else if(trackType.equalsIgnoreCase("BBRacewayJapan")){
            return new BBRaceway();
        }
        return null;
    }
}
