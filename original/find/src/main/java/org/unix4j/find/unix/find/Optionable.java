package org.unix4j.find.unix.find;

import org.unix4j.find.option.Option;

interface Optionable<O extends Option> {
    O getOption();
}
