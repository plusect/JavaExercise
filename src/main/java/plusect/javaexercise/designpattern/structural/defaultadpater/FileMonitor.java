package plusect.javaexercise.designpattern.structural.defaultadpater;

public class FileMonitor extends FileAlterationListenerAdapter {
    @Override
    public void onFileCreate(String file) {
        //文件创建
        doSomething();
    }

    private void doSomething() {
    }

    @Override
    public void onFileDelete(String file) {
        //文件删除
        doSomething();
    }
}
