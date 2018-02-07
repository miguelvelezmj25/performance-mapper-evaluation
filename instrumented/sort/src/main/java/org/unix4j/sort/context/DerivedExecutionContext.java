package org.unix4j.sort.context;

import org.unix4j.sort.convert.ConverterRegistry;
import org.unix4j.sort.convert.ValueConverter;
import org.unix4j.sort.util.FileUtil;
import org.unix4j.sort.variable.ExecutionContextVariableResolver;
import org.unix4j.sort.variable.VariableContext;

import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

/**
 * A derived execution context allows overriding of some values while forwarding
 * other getter calls to an original delegate context.
 */
public class DerivedExecutionContext implements ExecutionContext {

    private final ExecutionContext delegate;

    private String user;
    private File userHome;
    private File tempDirectory;
    private File currentDirectory;
    private Locale locale;
    private Map<String, String> env = null;
    private Properties sys;
    private VariableContext variableContext = null;
    private ConverterRegistry converterRegistry = null;

    /**
     * Constructor for new derived execution context with a new instance of
     * {@link DefaultExecutionContext} as delegate context.
     */
    public DerivedExecutionContext() {
        this(new DefaultExecutionContext());
    }

    /**
     * Constructor for new derived execution context with the specified delegate
     * context.
     *
     * @param delegate the delegate context to which all getter calls are forwarded
     *                 by default
     */
    public DerivedExecutionContext(ExecutionContext delegate) {
        this.delegate = delegate;
        init();
    }

    /**
     * Initialisation method called from the constructor. The default
     * implementation adds a {@link ExecutionContextVariableResolver} for this
     * derived context to the {@link VariableContext}.
     *
     * @see #getVariableContext()
     */
    protected void init() {
        getVariableContext().addVariableResolver(new ExecutionContextVariableResolver(this));
    }

    public void setCurrentDirectory(File currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    @Override
    public File getCurrentDirectory() {
        if(currentDirectory != null) {
            return currentDirectory;
        }
        return delegate.getCurrentDirectory();
    }

    public void setCurrentDirectory(String currentDirectory) {
        setCurrentDirectory(currentDirectory == null ? null : new File(currentDirectory));
    }

    @Override
    public File getRelativeToCurrentDirectory(File file) {
        return FileUtil.toAbsoluteFile(getCurrentDirectory(), file);
    }

    @Override
    public String getUser() {
        if(user != null) {
            return user;
        }
        return delegate.getUser();
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUserHome(File userHome) {
        this.userHome = userHome;
    }

    @Override
    public File getUserHome() {
        if(userHome != null) {
            return userHome;
        }
        return delegate.getUserHome();
    }

    public void setUserHome(String userHome) {
        setUserHome(userHome == null ? null : new File(userHome));
    }

    public void setTempDirectory(File tempDirectory) {
        this.tempDirectory = tempDirectory;
    }

    @Override
    public File getTempDirectory() {
        if(tempDirectory != null) {
            return tempDirectory;
        }
        return delegate.getTempDirectory();
    }

    public void setTempDirectory(String tempDirectory) {
        setTempDirectory(tempDirectory == null ? null : new File(tempDirectory));
    }

    @Override
    public Locale getLocale() {
        if(locale != null) {
            return locale;
        }
        return delegate.getLocale();
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override
    public Map<String, String> getEnv() {
        if(env != null) {
            return env;
        }
        return delegate.getEnv();
    }

    public void setEnv(Map<String, String> env) {
        this.env = env;
    }

    @Override
    public Properties getSys() {
        if(sys != null) {
            return sys;
        }
        return delegate.getSys();
    }

    public void setSys(Properties sys) {
        this.sys = sys;
    }

    @Override
    public VariableContext getVariableContext() {
        if(variableContext != null) {
            return variableContext;
        }
        return delegate.getVariableContext();
    }

    public void setVariableContext(VariableContext variableContext) {
        this.variableContext = variableContext;
    }

    @Override
    public ConverterRegistry getConverterRegistry() {
        if(converterRegistry != null) {
            return converterRegistry;
        }
        return delegate.getConverterRegistry();
    }

    public void setConverterRegistry(ConverterRegistry converterRegistry) {
        this.converterRegistry = converterRegistry;
    }

    @Override
    public <V> ValueConverter<V> getValueConverterFor(Class<V> type) {
        return getConverterRegistry().getValueConverterFor(type);
    }
}
