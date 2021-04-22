import java.util.List;
public class PointCloudData extends CenterCordi{
  //store the X of data that can be directly used to daw on the screen
  private List<Integer> VisualX;
  //store the Y of data that can be directly used to daw on the screen
  private List<Integer> VisualY;

  //Offset is for the changed angle
  public Boolean OffsetX(int num){return true;}
  public Boolean OffsetY(int num){return true;}
  public Boolean OffsetZ(int num){return true;}

  //GetVisual provide the data of VisaulX and VisualY
  public Boolean GetVisual(List<Integer> CopyX,List<Integer> CopyY){
    CopyX.addAll(VisualX);
    CopyY.addAll(VisualY);
    return true;
  }

  @Override
  //DataLoad used to load Raw Data
  public Boolean DataLoad(){return true;}
  @Override
  //Projection used to translate Raw Data to be on the xy plain
  public Boolean Projection(){return true;}
  @Override
  //CordiTran used to change the center of the xy plain
  public Boolean CordiTran(){return true;}

}
