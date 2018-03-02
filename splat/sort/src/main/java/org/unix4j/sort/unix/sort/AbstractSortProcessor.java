package org.unix4j.sort.unix.sort;


import org.unix4j.sort.context.ExecutionContext;
import org.unix4j.sort.line.Line;
import org.unix4j.sort.processor.AbstractLineProcessor;
import org.unix4j.sort.processor.LineProcessor;
import org.unix4j.sort.util.sort.DecimalNumberStringComparator;
import org.unix4j.sort.util.sort.LineComparator;
import org.unix4j.sort.util.sort.ReverseOrderComparator;
import org.unix4j.sort.util.sort.ScientificNumberStringComparator;

import java.util.Comparator;

abstract class AbstractSortProcessor extends AbstractLineProcessor {

    private final Comparator<? super Line> comparator;
    private SortArguments arguments;

    public AbstractSortProcessor(ExecutionContext context, LineProcessor output, SortArguments arguments) {
        super(context, output);
        this.arguments = arguments;
        this.comparator = initComparator();
    }

    protected Comparator<? super Line> getComparator() {
        return comparator;
    }

    private Comparator<? super Line> initComparator() {
        final SortArguments args = this.arguments;
        final Comparator<? super Line> comparator;
        if(args.isComparatorSet()) {
            comparator = args.getComparator();
        }
        else {
            if(args.isNumericSort()) {
                comparator = DecimalNumberStringComparator.getInstance(getContext().getLocale());
            }
            else if(args.isGeneralNumericSort()) {
                comparator = ScientificNumberStringComparator.INSTANCE;
            }
            else {
                if(args.isIgnoreLeadingBlanks()) {
                    comparator = args.isIgnoreCase() ? LineComparator.COLLATOR_IGNORE_CASE_AND_LEADING_BLANKS : LineComparator.COLLATOR_IGNORE_LEADING_BLANKS;
                }
                else {
                    comparator = args.isIgnoreCase() ? LineComparator.COLLATOR_IGNORE_CASE : LineComparator.COLLATOR;
                }
            }
        }
        if(args.isReverse()) {
            return ReverseOrderComparator.reverse(comparator);
        }
        return comparator;
    }

}
