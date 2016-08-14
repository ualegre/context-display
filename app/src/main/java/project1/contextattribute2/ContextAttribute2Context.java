package project1.contextattribute2; /*
 * Copyright 2016 Middlesex University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import uk.ac.mdx.cs.ie.acontextlib.PullObserver;

import uk.ac.mdx.cs.ie.acontextlib.PullObserver;



import android.content.Context;
import android.os.Environment;

import uk.ac.mdx.cs.ie.acontextlib.PullObserver;

/**
 * This class has been automatically generated by icase (Implementation for 
 * Context-Aware Systems Engineering). Please fill in the corresponding code.
 */
public class ContextAttribute2Context extends PullObserver {

	/* 
	//Include your variables here
	//This is an example for checking the external storage
    private final static long SIZE_KB = 1024L;
    private final static long SIZE_MB = SIZE_KB * SIZE_KB;
    private long mCurrentSpace;

	*/
    public ContextAttribute2Context(Context c) {
        super(c, 3000, "ContextAttribute2Context");
    }

    @Override
    public void checkContext() {
		/* 
		// Include your main code to observe context here
		// This is an example of checking the external storage of the phone
        long v = Environment.getExternalStorageDirectory().getUsableSpace();
        if (mCurrentSpace != v) {
            sendToContextReceivers("sensor.external_storage_remaining", v / SIZE_MB);
            mCurrentSpace = v;
        }
		*/

        sendToContextReceivers("test", true);
    }

}