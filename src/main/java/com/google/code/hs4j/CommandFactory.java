/**
 *Copyright [2010-2011] [dennis zhuang(killme2008@gmail.com)]
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License. 
 *You may obtain a copy of the License at 
 *             http://www.apache.org/licenses/LICENSE-2.0 
 *Unless required by applicable law or agreed to in writing, 
 *software distributed under the License is distributed on an "AS IS" BASIS, 
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 *either express or implied. See the License for the specific language governing permissions and limitations under the License
 */
package com.google.code.hs4j;

/**
 * A factory to create HandlerSocket commands
 * 
 * @author dennis
 * @date 2010-11-27
 */
public interface CommandFactory {

	Protocol getProtocol();

	public Command createOpenIndexCommand(String id, String db,
			String tableName, String indexName, String[] fieldList);

	public Command createInsertCommand(String id, String[] values);

	public Command createFindCommand(String id, FindOperator operator,
			String[] keys, int limit, int offset, String[] fieldList);

	public Command createUpdateCommand(String id, FindOperator operator,
			String[] keys, String[] values, int limit, int offset);

	public Command createDeleteCommand(String id, FindOperator operator,
			String[] keys, int limit, int offset);

}