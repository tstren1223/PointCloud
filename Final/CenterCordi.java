import java.util.List;
public abstract class CenterCordi extends Cloud{
  //store the center of X
  protected List<Integer>  CenterX;
  //store the center of Y
  protected List<Integer>  CenterY;
  //change the center and translate data
  abstract Boolean CordiTran();
}
