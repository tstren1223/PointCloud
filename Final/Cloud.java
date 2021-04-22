import java.util.List;
public abstract class Cloud extends RawPoint{
  //store the translated result of X
  protected List<Integer>  CloudX;
  //store the translated result of Y
  protected List<Integer>  CloudY;
  //let Raw Data translated to xy plane
  abstract Boolean Projection();
}
