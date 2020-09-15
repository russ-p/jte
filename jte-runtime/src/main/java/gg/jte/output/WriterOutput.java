package gg.jte.output;

import gg.jte.TemplateOutput;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;

public class WriterOutput implements TemplateOutput {
    private final Writer writer;

    public WriterOutput(Writer writer) {
        this.writer = writer;
    }

    @Override
    public Writer getWriter() {
        return writer;
    }

    @Override
    public void writeContent(String value) {
        try {
            writer.write(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
