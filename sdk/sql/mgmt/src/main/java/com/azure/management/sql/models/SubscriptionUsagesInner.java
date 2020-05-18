// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SubscriptionUsages. */
public final class SubscriptionUsagesInner {
    private final ClientLogger logger = new ClientLogger(SubscriptionUsagesInner.class);

    /** The proxy service used to perform REST calls. */
    private final SubscriptionUsagesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of SubscriptionUsagesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SubscriptionUsagesInner(SqlManagementClientImpl client) {
        this.service =
            RestProxy.create(SubscriptionUsagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientSubscriptionUsages to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientS")
    private interface SubscriptionUsagesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<SubscriptionUsageListResultInner>> listByLocation(
            @HostParam("$host") String host,
            @PathParam("locationName") String locationName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/usages" + "/{usageName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<SubscriptionUsageInner>> get(
            @HostParam("$host") String host,
            @PathParam("locationName") String locationName,
            @PathParam("usageName") String usageName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<SubscriptionUsageListResultInner>> listByLocationNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscription usage metrics in a given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SubscriptionUsageInner>> listByLocationSinglePageAsync(String locationName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByLocation(
                            this.client.getHost(), locationName, this.client.getSubscriptionId(), apiVersion, context))
            .<PagedResponse<SubscriptionUsageInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscription usage metrics in a given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SubscriptionUsageInner>> listByLocationSinglePageAsync(
        String locationName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01-preview";
        return service
            .listByLocation(this.client.getHost(), locationName, this.client.getSubscriptionId(), apiVersion, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscription usage metrics in a given location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SubscriptionUsageInner> listByLocationAsync(String locationName) {
        return new PagedFlux<>(
            () -> listByLocationSinglePageAsync(locationName), nextLink -> listByLocationNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscription usage metrics in a given location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SubscriptionUsageInner> listByLocationAsync(String locationName, Context context) {
        return new PagedFlux<>(
            () -> listByLocationSinglePageAsync(locationName, context),
            nextLink -> listByLocationNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscription usage metrics in a given location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SubscriptionUsageInner> listByLocation(String locationName) {
        return new PagedIterable<>(listByLocationAsync(locationName));
    }

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subscription usage metric.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SubscriptionUsageInner>> getWithResponseAsync(String locationName, String usageName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (usageName == null) {
            return Mono.error(new IllegalArgumentException("Parameter usageName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            locationName,
                            usageName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subscription usage metric.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SubscriptionUsageInner>> getWithResponseAsync(
        String locationName, String usageName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (usageName == null) {
            return Mono.error(new IllegalArgumentException("Parameter usageName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01-preview";
        return service
            .get(this.client.getHost(), locationName, usageName, this.client.getSubscriptionId(), apiVersion, context);
    }

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subscription usage metric.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SubscriptionUsageInner> getAsync(String locationName, String usageName) {
        return getWithResponseAsync(locationName, usageName)
            .flatMap(
                (SimpleResponse<SubscriptionUsageInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subscription usage metric.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubscriptionUsageInner get(String locationName, String usageName) {
        return getAsync(locationName, usageName).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of subscription usage metrics in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SubscriptionUsageInner>> listByLocationNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listByLocationNext(nextLink, context))
            .<PagedResponse<SubscriptionUsageInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of subscription usage metrics in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SubscriptionUsageInner>> listByLocationNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listByLocationNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
