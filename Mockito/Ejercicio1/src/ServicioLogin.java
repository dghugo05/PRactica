public class ServicioLogin {
    private RepositorioUsuarios miRepositorio;

    public ServicioLogin(RepositorioUsuarios miRepo){
        miRepositorio = miRepo;
    }

    public boolean login(String user){
        return miRepositorio.existeUser(user);
    }
}
