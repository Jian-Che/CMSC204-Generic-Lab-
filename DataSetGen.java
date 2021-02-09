public class DataSetGen<T extends Measurable>
{
   private double sum;
   private T maximum;
   private int count;

   /**
    * Constructs an empty data set
    */
   public DataSetGen()
   {
      sum = 0;
      count = 0;
      maximum = null;
   }

   /**
    * Adds a value to a data set
    * 
    * @param x Value to add
    */
   public void add(T x)
   {
      sum = sum + x.getMeasure();
      
      if (count == 0 || maximum.getMeasure() < x.getMeasure()) {
         maximum = x; 
      }
         
      count++;
   }

   /**
    * Gets the average of a data set
    * 
    * @return Set average
    */
   public double getAverage()
   {
       if (count == 0) return 0;
      else return sum / count;
   }

   /**
    * Gets the largest value of a data set
    * 
    * @return the maximum or 0 if no data has been added
    */
   public T getMaximum()
   {
      return (T) maximum;
   }
}
