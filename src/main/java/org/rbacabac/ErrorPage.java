package org.rbacabac;


import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

/**
 * Errors routed here where it's job is to display out an error message.
 */
public class ErrorPage extends WicketSampleBasePage
{
    public ErrorPage( Exception e )
    {
        add( new Label( "title", new Model<>( "Runtime Exception Occurred" ) ) );
        add( new Label( "message", new Model<>( e.getLocalizedMessage() ) ) );
    }
}
