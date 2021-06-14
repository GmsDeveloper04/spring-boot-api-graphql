package br.next.core.exception.hadler;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import graphql.GraphQLError;
import graphql.servlet.GraphQLErrorHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class GraphQLErrorHandlerImpl implements GraphQLErrorHandler {

    @Override
    public List<GraphQLError> processErrors(List<GraphQLError> graphQLErrors) {
        return graphQLErrors.stream().map(this::handleGraphQLError).collect(Collectors.toList());
    }

    private GraphQLError handleGraphQLError(GraphQLError error) {
    	log.error(error.getMessage(),error);
    	throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "ValidationError: " + error.getMessage());
    }

}
