package td.td4;

public interface IFile {
    public void enfiler(Object o) throws FilePleineException;
    public void defiler() throws FileVideException;
    public Object tete() throws FileVideException;
    public boolean estVide();
    public int longueur();
}
