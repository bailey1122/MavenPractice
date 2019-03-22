package org.sonatype.mavenbook.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import java.io.File;
import org.codehaus.plexus.archiver.zip.ZipArchiver;




import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;



/**
 * Zips up the output directory.
 * @goal zip
 * @phase package
 */
public class ZipMojo extends AbstractMojo
{
 /**
 * The Zip archiver.
 * @parameter expression="${component.org.codehaus.plexus.archiver.Archiver#zip}"
 */
 private ZipArchiver zipArchiver;
 /**
 * Directory containing the build files.
 * @parameter expression="${project.build.directory}"
 */
 private File buildDirectory;
 /**
 * Base directory of the project.
 * @parameter expression="${basedir}"
 */
 private File baseDirectory;
 /**
 * A set of file patterns to include in the zip.
 * @parameter alias="${includes}"
 */
 private String[] mIncludes = { "a", "b" };
 /**
 * A set of file patterns to exclude from the zip.
 * @parameter alias="${excludes}"
 */
 private String[] mExcludes = { "d", "c" };
 String a = " f ";
 public void setExcludes( String[] excludes ) { mExcludes = excludes; }
 public void setIncludes( String[] includes ) { mIncludes = includes; }
 public void execute()
 throws MojoExecutionException
{
 try {
 zipArchiver.addDirectory( buildDirectory, mIncludes, mExcludes );
 zipArchiver.setDestFile( new File( baseDirectory, "output.zip" ) );
 zipArchiver.createArchive();
 } catch( Exception e ) {
 throw new MojoExecutionException( "Could not zip", e );
 }
 }
}