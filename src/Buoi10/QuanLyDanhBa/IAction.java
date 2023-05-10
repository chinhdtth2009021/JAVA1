package Buoi10.QuanLyDanhBa;

public interface IAction {
    boolean send(String phoneNumber);
    boolean sendMagessge(String phoneNumber,String magessge);
}
