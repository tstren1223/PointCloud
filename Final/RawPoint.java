import java.util.List;
public abstract class RawPoint {
  //store the Raw Data of X
  protected  List<Integer> RawX;
  //store the Raw Data of Y
  protected  List<Integer> RawY;
  //store the Raw Data of Z
  protected  List<Integer> RawZ;
  //store the path of the data
  protected  String Route;
  //process the action of load data
  abstract Boolean DataLoad();

}
