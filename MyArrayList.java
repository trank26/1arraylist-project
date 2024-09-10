public class MyArrayList<E>
{
    Object[] alist;//This can not be type E 
    int[] blist;
    int size;
    
 

    public MyArrayList()
    {
        alist = new Object[0];
       
        size = 0;


      
    }
    
    public void add(E value){
        Object[] temp = new Object[size + 1];
        for(int i = 0; i < size; i++){
            temp[i] = alist[i];
        }
        temp[(size + 1)] = value;
        size++;
    }

    public void add(int spot, E value){
        Object[] temp = new Object[size];
            for (int i = 0; i < alist.length; i++) {
                temp[i] = alist[i];
                    }
                alist = new Object[size + 1];
            for (int i = 0; i < alist.length; i++) {
                if(i == spot){
                alist[i] = value;
                } else if(i < spot)
                       alist[i] = temp[i];
                else
                    alist[i]= temp[i - 1];
            }
            size++;
        
        
           
    }

    public void set (int spot, E value) {
        Object[] temp = new Object[size];
            for (int i = 0; i < alist.length; i++) {
                          temp[i] = alist[i];
                    }

                alist = new Object[size + 1];

            for (int i = 0; i < alist.length; i++) {
                if(i == spot){
                    alist[i] = value;
                }
            
            }
     }
    public int size(){
            return alist.length;
       
        
       
    }


    public Object get(int spot) {
             return alist[spot];
    }
        
        
           
    

    public Object remove(int spot){
        Object[] temp = new Object[size];
        for(int i = 0; i < alist.length; i++){
           temp[i] = alist[i];

        }
        for(int j = 0; j < alist.length-2; j++){
            if(j < spot){
                alist[j] = temp[j];
            }
            else{ 
                temp[j] = alist[j + 1];
            }
        }
        for(int e = 0; e < alist.length; e++){
                alist[e] = temp[e];
        }
        return alist[spot];
              
     }



}