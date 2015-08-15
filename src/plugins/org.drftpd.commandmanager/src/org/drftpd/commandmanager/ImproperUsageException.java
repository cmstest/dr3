/*
 * This file is part of DrFTPD, Distributed FTP Daemon.
 *
 * DrFTPD is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * DrFTPD is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DrFTPD; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.drftpd.commandmanager;

/**
 * @author zubov
 * @version $Id: ImproperUsageException.java 1925 2009-06-15 21:46:05Z tdsoul $
 */
@SuppressWarnings("serial")
public class ImproperUsageException extends Exception {

	public ImproperUsageException() {
		super();
	}

	public ImproperUsageException(String arg0) {
		super(arg0);
	}

	public ImproperUsageException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ImproperUsageException(Throwable arg0) {
		super(arg0);
	}
}
