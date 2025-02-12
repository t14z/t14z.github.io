package fun.yinwj.www.command;

import com.faddenyin.www.function.*;
import fun.yinwj.www.function.CopyArticle;
import fun.yinwj.www.function.CopyStaticFile;
import fun.yinwj.www.function.DeleteOut;
import fun.yinwj.www.function.ReadmeGenerator;


public class Build {
    public void action() throws Exception {

        System.out.println("delete article css js README.md");
        new DeleteOut().action();

        System.out.println("copy js css");
        new CopyStaticFile().action();

        System.out.println("copy article");
        new CopyArticle().action();

        //System.out.println("generate index files");
        //new IndexGenerator().action();

        System.out.println("generate README.md");
        new ReadmeGenerator().action();

    }
}
