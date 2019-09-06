package plusect.javaexercise.designpattern.structural.defaultadpater;


/**
 * 此接口的一大问题是抽象方法太多了，如果我们要用这个接口，意味着我们要实现每一个抽象方法，
 * 如果我们只是想要监控文件夹中的文件创建和文件删除事件，可是我们还是不得不实现所有的方法，很明显，这不是我们想要的。
 *
 * 所以，我们需要下面的一个*配器，它用于实现上面的接口，但是所有的方法都是空方法，
 * 这样，我们就可以转而定义自己的类来继承下面这个类即可。
 */
public interface FileAlterationListener {
    void onStart(String observer);
    void onDirectoryCreate(String directory);
    void onDirectoryChange(String directory);
    void onDirectoryDelete(String directory);
    void onFileCreate(String file);
    void onFileChange(String file);
    void onFileDelete(String file);
    void onStop(String observer);
}
