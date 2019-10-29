
package EstudioDeCaso;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ivan
 */
public class ListaCantantesFamosos {
    private ArrayList<CantanteFamoso>listaCantantesFamosos;

    public ListaCantantesFamosos() {
        this.listaCantantesFamosos = new <CantanteFamoso>ArrayList();
       
    }

   
    public void listarCantantesFamosos(){
        CantanteFamoso c;
        Iterator<CantanteFamoso>it=listaCantantesFamosos.iterator();
        while (it.hasNext()) {
            c = it.next();
            System.out.println("Cantante o Grupo:--> "+ c.getNombre());
            System.out.println("Disco con más ventas en todo el mundo:-->"+c.getDiscoConMasVentas());
        }
    }
 
    public ArrayList<CantanteFamoso> getListaCantantesFamosos() {
        return listaCantantesFamosos;
    }

    public void setListaCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        this.listaCantantesFamosos = listaCantantesFamosos;
    }
    public void setCantanteFamoso(CantanteFamoso Cantante){
        listaCantantesFamosos.add(Cantante);
    }
}
