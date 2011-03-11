package gen;

public interface ContentProvider {

   /**
    * Returns generated content.
    * @return the content that was generated by particular generator
    */
   public String getContent();

   /**
    * Returns true if there is valuable content, otherwise returns false.
    * @return
    */
   public boolean hasValuableContent();
}
