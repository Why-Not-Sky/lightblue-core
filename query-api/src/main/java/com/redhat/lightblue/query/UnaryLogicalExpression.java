/*
    Copyright 2013 Red Hat, Inc. and/or its affiliates.

    This file is part of lightblue.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.redhat.lightblue.query;

public class UnaryLogicalExpression extends LogicalExpression {

    private UnaryLogicalOperator op;
    private QueryExpression query;

    public UnaryLogicalExpression() {}

    public UnaryLogicalExpression(UnaryLogicalOperator op,
                                  QueryExpression query) {
        this.op=op;
        this.query=query;
    }
    
    public UnaryLogicalOperator getOp() {
        return this.op;
    }

    public void setOp(UnaryLogicalOperator argOp) {
        this.op = argOp;
    }

    public QueryExpression getQuery() {
        return this.query;
    }

    public void setQuery(QueryExpression argQuery) {
        this.query = argQuery;
    }

}
