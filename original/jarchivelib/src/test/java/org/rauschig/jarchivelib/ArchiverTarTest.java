/**
 * Copyright 2013 Thomas Rausch
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rauschig.jarchivelib;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class ArchiverTarTest extends AbstractArchiverTest {

    @Override
    protected Archiver getArchiver() {
        return ArchiverFactory.createArchiver(ArchiveFormat.TAR);
    }

    @Override
    protected File getArchive() {
        return new File(RESOURCES_DIR, "archive.tar");
    }

    @Test
    public void getFilenameExtension_tar_returnsCorrectFilenameExtension() throws Exception {
        assertEquals(".tar", getArchiver().getFilenameExtension());
    }

}
