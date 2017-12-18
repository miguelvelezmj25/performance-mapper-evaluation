package org.unix4j.grep.builder;

import org.unix4j.grep.command.Command;
import org.unix4j.grep.command.NoOp;
import org.unix4j.grep.context.DefaultExecutionContext;
import org.unix4j.grep.context.ExecutionContextFactory;
import org.unix4j.grep.operation.LineOperation;
import org.unix4j.grep.unix.Grep;
//import org.unix4j.grep.unix.cat.CatOptions;
//import org.unix4j.grep.unix.cut.CutOptions;
//import org.unix4j.grep.unix.echo.EchoOptions;
//import org.unix4j.grep.unix.find.FindOptions;
import org.unix4j.grep.unix.grep.GrepOptions;
//import org.unix4j.grep.unix.head.HeadOptions;
//import org.unix4j.grep.unix.ls.LsOptions;
//import org.unix4j.grep.unix.sed.SedOptions;
//import org.unix4j.grep.unix.sort.SortOptions;
//import org.unix4j.grep.unix.tail.TailOptions;
//import org.unix4j.grep.unix.uniq.UniqOptions;
//import org.unix4j.grep.unix.wc.WcOptions;
//import org.unix4j.grep.unix.xargs.XargsOptions;

/**
 * Default implementation for {@link Unix4jCommandBuilder}. Application code
 * does usually not directly refer to this class but uses it indirectly through
 * the static methods in {@link org.unix4j.Unix4j Unix4j}.
 */
public class DefaultUnix4jCommandBuilder extends DefaultCommandBuilder implements Unix4jCommandBuilder {

    /**
     * Default constructor initialized with a {@link NoOp} command which will be
     * replaced by the first command joined to this builder's command chain.
     * Uses a {@link DefaultExecutionContext} to execute commands.
     */
    public DefaultUnix4jCommandBuilder() {
        super();
    }

    /**
     * Constructor using the specified factory to create contexts for command
     * execution. The builder is initialized with a {@link NoOp} command which
     * will be replaced by the first command joined to this builder's command
     * chain.
     *
     * @param contextFactory the factory used to create execution contexts that are passed
     *                       to the execute method when a command is executed
     */
    public DefaultUnix4jCommandBuilder(ExecutionContextFactory contextFactory) {
        super(contextFactory);
    }


    /* ------------------ cat ------------------ */
//    @Override
//    public Unix4jCommandBuilder cat() {
//        join(Cat.Factory.cat());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cat(String... args) {
//        join(Cat.Factory.cat(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cat(java.io.File... files) {
//        join(Cat.Factory.cat(files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cat(CatOptions options) {
//        join(Cat.Factory.cat(options));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cat(CatOptions options, java.io.File... files) {
//        join(Cat.Factory.cat(options, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cat(CatOptions options, String... paths) {
//        join(Cat.Factory.cat(options, paths));
//        return this;
//    }
//
//    /* ------------------ cd ------------------ */
//    @Override
//    public Unix4jCommandBuilder cd() {
//        join(Cd.Factory.cd());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cd(java.io.File file) {
//        join(Cd.Factory.cd(file));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cd(String path) {
//        join(Cd.Factory.cd(path));
//        return this;
//    }
//
//    /* ------------------ cut ------------------ */
//    @Override
//    public Unix4jCommandBuilder cut(String... args) {
//        join(Cut.Factory.cut(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cut(CutOptions options, org.unix4j.grep.util.Range range) {
//        join(Cut.Factory.cut(options, range));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cut(CutOptions options, int... indexes) {
//        join(Cut.Factory.cut(options, indexes));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cut(CutOptions options, String delimiter, org.unix4j.grep.util.Range range) {
//        join(Cut.Factory.cut(options, delimiter, range));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cut(CutOptions options, String delimiter, int... indexes) {
//        join(Cut.Factory.cut(options, delimiter, indexes));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cut(CutOptions options, String delimiter, char outputDelimiter, org.unix4j.grep.util.Range range) {
//        join(Cut.Factory.cut(options, delimiter, outputDelimiter, range));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder cut(CutOptions options, String delimiter, char outputDelimiter, int... indexes) {
//        join(Cut.Factory.cut(options, delimiter, outputDelimiter, indexes));
//        return this;
//    }
//
//    /* ------------------ echo ------------------ */
//    @Override
//    public Unix4jCommandBuilder echo(String... args) {
//        join(Echo.Factory.echo(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder echo(EchoOptions options, String string) {
//        join(Echo.Factory.echo(options, string));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder echo(EchoOptions options, String... strings) {
//        join(Echo.Factory.echo(options, strings));
//        return this;
//    }
//
//    /* ------------------ find ------------------ */
//    @Override
//    public Unix4jCommandBuilder find(String... args) {
//        join(Find.Factory.find(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(String path) {
//        join(Find.Factory.find(path));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(String path, String name) {
//        join(Find.Factory.find(path, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(long size) {
//        join(Find.Factory.find(size));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(String path, long size) {
//        join(Find.Factory.find(path, size));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(long size, String name) {
//        join(Find.Factory.find(size, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(String path, long size, String name) {
//        join(Find.Factory.find(path, size, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, String name) {
//        join(Find.Factory.find(options, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, String path, String name) {
//        join(Find.Factory.find(options, path, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, long size) {
//        join(Find.Factory.find(options, size));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, String path, long size) {
//        join(Find.Factory.find(options, path, size));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, java.util.Date time) {
//        join(Find.Factory.find(options, time));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, String path, java.util.Date time) {
//        join(Find.Factory.find(options, path, time));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, long size, String name) {
//        join(Find.Factory.find(options, size, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, String path, long size, String name) {
//        join(Find.Factory.find(options, path, size, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, java.util.Date time, String name) {
//        join(Find.Factory.find(options, time, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, String path, java.util.Date time, String name) {
//        join(Find.Factory.find(options, path, time, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, long size, java.util.Date time, String name) {
//        join(Find.Factory.find(options, size, time, name));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder find(FindOptions options, String path, long size, java.util.Date time, String name) {
//        join(Find.Factory.find(options, path, size, time, name));
//        return this;
//    }
//
//    /* ------------------ from ------------------ */
//    @Override
//    public Unix4jCommandBuilder fromString(String string) {
//        join(From.Factory.fromString(string));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder fromStrings(String... strings) {
//        join(From.Factory.fromStrings(strings));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder from(java.util.Collection<? extends String> lines) {
//        join(From.Factory.from(lines));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder fromFile(String path) {
//        join(From.Factory.fromFile(path));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder fromFile(java.io.File file) {
//        join(From.Factory.fromFile(file));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder fromResource(String resource) {
//        join(From.Factory.fromResource(resource));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder from(java.io.InputStream stream) {
//        join(From.Factory.from(stream));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder from(java.io.Reader reader) {
//        join(From.Factory.from(reader));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder from(java.net.URL url) {
//        join(From.Factory.from(url));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder from(org.unix4j.grep.io.Input input) {
//        join(From.Factory.from(input));
//        return this;
//    }

    /* ------------------ grep ------------------ */
    @Override
    public Unix4jCommandBuilder grep(String... args) {
        join(Grep.Factory.grep(args));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(String regexp) {
        join(Grep.Factory.grep(regexp));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(String regexp, java.io.File... files) {
        join(Grep.Factory.grep(regexp, files));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(java.util.regex.Pattern pattern) {
        join(Grep.Factory.grep(pattern));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(java.util.regex.Pattern pattern, java.io.File... files) {
        join(Grep.Factory.grep(pattern, files));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(java.util.regex.Pattern pattern, String... paths) {
        join(Grep.Factory.grep(pattern, paths));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(GrepOptions options, String regexp) {
        join(Grep.Factory.grep(options, regexp));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(GrepOptions options, java.util.regex.Pattern pattern) {
        join(Grep.Factory.grep(options, pattern));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(GrepOptions options, String regexp, java.io.File... files) {
        join(Grep.Factory.grep(options, regexp, files));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(GrepOptions options, String regexp, String... paths) {
        join(Grep.Factory.grep(options, regexp, paths));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(GrepOptions options, java.util.regex.Pattern pattern, java.io.File... files) {
        join(Grep.Factory.grep(options, pattern, files));
        return this;
    }

    @Override
    public Unix4jCommandBuilder grep(GrepOptions options, java.util.regex.Pattern pattern, String... paths) {
        join(Grep.Factory.grep(options, pattern, paths));
        return this;
    }



    public Unix4jCommandBuilder grep(boolean isIgnoreCase, boolean isInvertMatch, boolean isFixedStrings,
                                     boolean isLineNumber, boolean isCount, boolean isMatchingFiles, boolean isWholeLine,
                                     String regexp, String... paths) {
        join(Grep.Factory.grep(isIgnoreCase, isInvertMatch, isFixedStrings, isLineNumber, isCount, isMatchingFiles,
                isWholeLine, regexp, paths));
        return this;
    }

//    /* ------------------ head ------------------ */
//    @Override
//    public Unix4jCommandBuilder head() {
//        join(Head.Factory.head());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder head(String... args) {
//        join(Head.Factory.head(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder head(long count) {
//        join(Head.Factory.head(count));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder head(HeadOptions options, long count) {
//        join(Head.Factory.head(options, count));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder head(java.io.File... files) {
//        join(Head.Factory.head(files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder head(long count, java.io.File... files) {
//        join(Head.Factory.head(count, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder head(long count, String... paths) {
//        join(Head.Factory.head(count, paths));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder head(HeadOptions options, long count, java.io.File... files) {
//        join(Head.Factory.head(options, count, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder head(HeadOptions options, long count, String... paths) {
//        join(Head.Factory.head(options, count, paths));
//        return this;
//    }
//
//    /* ------------------ ls ------------------ */
//    @Override
//    public Unix4jCommandBuilder ls() {
//        join(Ls.Factory.ls());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder ls(String... args) {
//        join(Ls.Factory.ls(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder ls(java.io.File... files) {
//        join(Ls.Factory.ls(files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder ls(LsOptions options) {
//        join(Ls.Factory.ls(options));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder ls(LsOptions options, java.io.File... files) {
//        join(Ls.Factory.ls(options, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder ls(LsOptions options, String... paths) {
//        join(Ls.Factory.ls(options, paths));
//        return this;
//    }
//
//    /* ------------------ sed ------------------ */
//    @Override
//    public Unix4jCommandBuilder sed(String... args) {
//        join(Sed.Factory.sed(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sed(String script) {
//        join(Sed.Factory.sed(script));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sed(String regexp, String replacement) {
//        join(Sed.Factory.sed(regexp, replacement));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sed(String regexp, String replacement, int... occurrence) {
//        join(Sed.Factory.sed(regexp, replacement, occurrence));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sed(SedOptions options, String regexp) {
//        join(Sed.Factory.sed(options, regexp));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sed(SedOptions options, String string1, String string2) {
//        join(Sed.Factory.sed(options, string1, string2));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sed(SedOptions options, String string1, String string2, int... occurrence) {
//        join(Sed.Factory.sed(options, string1, string2, occurrence));
//        return this;
//    }
//
//    /* ------------------ sort ------------------ */
//    @Override
//    public Unix4jCommandBuilder sort() {
//        join(Sort.Factory.sort());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(String... args) {
//        join(Sort.Factory.sort(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(java.io.File... files) {
//        join(Sort.Factory.sort(files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(java.util.Comparator<? super org.unix4j.grep.line.Line> comparator) {
//        join(Sort.Factory.sort(comparator));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(java.util.Comparator<? super org.unix4j.grep.line.Line> comparator, java.io.File... files) {
//        join(Sort.Factory.sort(comparator, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(java.util.Comparator<? super org.unix4j.grep.line.Line> comparator, String... paths) {
//        join(Sort.Factory.sort(comparator, paths));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(SortOptions options) {
//        join(Sort.Factory.sort(options));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(SortOptions options, java.io.File... files) {
//        join(Sort.Factory.sort(options, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(SortOptions options, String... paths) {
//        join(Sort.Factory.sort(options, paths));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(SortOptions options, java.util.Comparator<? super org.unix4j.grep.line.Line> comparator) {
//        join(Sort.Factory.sort(options, comparator));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(SortOptions options, java.util.Comparator<? super org.unix4j.grep.line.Line> comparator, java.io.File... files) {
//        join(Sort.Factory.sort(options, comparator, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder sort(SortOptions options, java.util.Comparator<? super org.unix4j.grep.line.Line> comparator, String... paths) {
//        join(Sort.Factory.sort(options, comparator, paths));
//        return this;
//    }
//
//    /* ------------------ tail ------------------ */
//    @Override
//    public Unix4jCommandBuilder tail() {
//        join(Tail.Factory.tail());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder tail(String... args) {
//        join(Tail.Factory.tail(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder tail(long count) {
//        join(Tail.Factory.tail(count));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder tail(TailOptions options, long count) {
//        join(Tail.Factory.tail(options, count));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder tail(java.io.File... files) {
//        join(Tail.Factory.tail(files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder tail(long count, java.io.File... files) {
//        join(Tail.Factory.tail(count, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder tail(long count, String... paths) {
//        join(Tail.Factory.tail(count, paths));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder tail(TailOptions options, long count, java.io.File... files) {
//        join(Tail.Factory.tail(options, count, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder tail(TailOptions options, long count, String... paths) {
//        join(Tail.Factory.tail(options, count, paths));
//        return this;
//    }
//
//    /* ------------------ uniq ------------------ */
//    @Override
//    public Unix4jCommandBuilder uniq() {
//        join(Uniq.Factory.uniq());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder uniq(String... args) {
//        join(Uniq.Factory.uniq(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder uniq(java.io.File file) {
//        join(Uniq.Factory.uniq(file));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder uniq(String path) {
//        join(Uniq.Factory.uniq(path));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder uniq(UniqOptions options) {
//        join(Uniq.Factory.uniq(options));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder uniq(UniqOptions options, java.io.File file) {
//        join(Uniq.Factory.uniq(options, file));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder uniq(UniqOptions options, String path) {
//        join(Uniq.Factory.uniq(options, path));
//        return this;
//    }
//
//    /* ------------------ wc ------------------ */
//    @Override
//    public Unix4jCommandBuilder wc() {
//        join(Wc.Factory.wc());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder wc(String... args) {
//        join(Wc.Factory.wc(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder wc(java.io.File... files) {
//        join(Wc.Factory.wc(files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder wc(WcOptions options) {
//        join(Wc.Factory.wc(options));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder wc(WcOptions options, java.io.File... files) {
//        join(Wc.Factory.wc(options, files));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder wc(WcOptions options, String[] paths) {
//        join(Wc.Factory.wc(options, paths));
//        return this;
//    }
//
//    /* ------------------ xargs ------------------ */
//    @Override
//    public Unix4jCommandBuilder xargs() {
//        join(Xargs.Factory.xargs());
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(String... args) {
//        join(Xargs.Factory.xargs(args));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(String delimiter) {
//        join(Xargs.Factory.xargs(delimiter));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(long maxLines) {
//        join(Xargs.Factory.xargs(maxLines));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(int maxArgs) {
//        join(Xargs.Factory.xargs(maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(long maxLines, int maxArgs) {
//        join(Xargs.Factory.xargs(maxLines, maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(String delimiter, long maxLines) {
//        join(Xargs.Factory.xargs(delimiter, maxLines));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(String delimiter, int maxArgs) {
//        join(Xargs.Factory.xargs(delimiter, maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(String delimiter, long maxLines, int maxArgs) {
//        join(Xargs.Factory.xargs(delimiter, maxLines, maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(String delimiter, String eof, long maxLines, int maxArgs) {
//        join(Xargs.Factory.xargs(delimiter, eof, maxLines, maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options) {
//        join(Xargs.Factory.xargs(options));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options, String delimiter) {
//        join(Xargs.Factory.xargs(options, delimiter));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options, long maxLines) {
//        join(Xargs.Factory.xargs(options, maxLines));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options, int maxArgs) {
//        join(Xargs.Factory.xargs(options, maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options, long maxLines, int maxArgs) {
//        join(Xargs.Factory.xargs(options, maxLines, maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options, String delimiter, long maxLines) {
//        join(Xargs.Factory.xargs(options, delimiter, maxLines));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options, String delimiter, int maxArgs) {
//        join(Xargs.Factory.xargs(options, delimiter, maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options, String delimiter, long maxLines, int maxArgs) {
//        join(Xargs.Factory.xargs(options, delimiter, maxLines, maxArgs));
//        return this;
//    }
//
//    @Override
//    public Unix4jCommandBuilder xargs(XargsOptions options, String delimiter, String eof, long maxLines, int maxArgs) {
//        join(Xargs.Factory.xargs(options, delimiter, eof, maxLines, maxArgs));
//        return this;
//    }

    @Override
    public Unix4jCommandBuilder join(Command<?> command) {
        super.join(command);
        return this;
    }

    @Override
    public Unix4jCommandBuilder apply(LineOperation operation) {
        super.apply(operation);
        return this;
    }

    @Override
    public Unix4jCommandBuilder reset() {
        super.reset();
        return this;
    }

}
