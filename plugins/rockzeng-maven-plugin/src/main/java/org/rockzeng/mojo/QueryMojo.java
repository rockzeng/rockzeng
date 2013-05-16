package org.rockzeng.mojo;

import java.util.Arrays;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author <a href="mailto:zengqingcong@gmail.com">Rock Zeng</a>
 *         Date: 16/5/13
 *         Time: 4:54 PM
 */
@Mojo(name = "query")
public class QueryMojo extends AbstractMojo {

    @Parameter
    private String url;

    @Parameter(defaultValue = "60")
    private int timeout;

    @Parameter
    private String[] options;


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("url:" + url + ",timeout:" + timeout + "]");
        getLog().info("options:" + Arrays.toString(options) + "]");
    }


}
