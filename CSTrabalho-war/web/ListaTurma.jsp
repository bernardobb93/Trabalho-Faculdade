<%@page import="model.Turma"%>

<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<body>

<a href="ServletTurma?acao=incluir">Novo Aluno</a>

<table border="1" width="100%">

<tr><td>Matricula</td><td>Aluno</td>

<td>Prova 1</td><td>Prova 2</td>

<td>Prova 3</td><td>Media</td>
<td>Status</td><td>Ação</td>

</tr>

<%

List<Turma> listagem = (List<Turma>)

request.getAttribute("listagem");

for(Turma t: listagem){

%>

<tr><td><%=t.getNumero()%></td><td><%=t.getAluno()%></td>

<td><%=t.getProva1()%></td><td><%=t.getProva2()%></td>
<td><%=t.getProva3()%></td><td><%=t.getMedia()%></td>
<td><%=t.getStatus()%></td>
<td><a href=

"ServletTurma?acao=excluirX&numero=<%=t.getNumero()%>">

Excluir Aluno</a></td></tr>

<% } %>

</table>

</body>

</html>